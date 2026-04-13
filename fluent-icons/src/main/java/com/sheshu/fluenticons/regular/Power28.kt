package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Power28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Power28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.69f, 5.267f)
            curveToRelative(0.162f, 0.381f, -0.016f, 0.821f, -0.397f, 0.983f)
            curveTo(6.887f, 7.695f, 4.5f, 11.07f, 4.5f, 15f)
            curveToRelative(0f, 5.247f, 4.253f, 9.5f, 9.5f, 9.5f)
            reflectiveCurveToRelative(9.5f, -4.253f, 9.5f, -9.5f)
            curveToRelative(0f, -3.93f, -2.387f, -7.305f, -5.793f, -8.75f)
            curveToRelative(-0.381f, -0.162f, -0.56f, -0.602f, -0.397f, -0.983f)
            curveToRelative(0.161f, -0.381f, 0.602f, -0.56f, 0.983f, -0.398f)
            curveTo(22.233f, 6.541f, 25f, 10.447f, 25f, 15f)
            curveToRelative(0f, 6.075f, -4.925f, 11f, -11f, 11f)
            reflectiveCurveTo(3f, 21.075f, 3f, 15f)
            curveToRelative(0f, -4.553f, 2.766f, -8.459f, 6.707f, -10.13f)
            curveToRelative(0.381f, -0.162f, 0.822f, 0.016f, 0.983f, 0.397f)
            close()
            moveTo(14f, 2f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-9.5f)
            curveTo(13.25f, 2.336f, 13.586f, 2f, 14f, 2f)
            close()
        }
    }.build()
}
