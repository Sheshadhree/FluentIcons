package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowClockwise28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowClockwise28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 14f)
            curveToRelative(0f, -5.247f, 4.253f, -9.5f, 9.5f, -9.5f)
            curveToRelative(2.732f, 0f, 5.195f, 1.152f, 6.928f, 3f)
            horizontalLineTo(18.25f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(17.836f, 9f, 18.25f, 9f)
            horizontalLineToRelative(4f)
            curveTo(22.664f, 9f, 23f, 8.664f, 23f, 8.25f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(21.5f, 3.836f, 21.5f, 4.25f)
            verticalLineToRelative(1.703f)
            curveTo(19.536f, 4.122f, 16.899f, 3f, 14f, 3f)
            curveTo(7.925f, 3f, 3f, 7.925f, 3f, 14f)
            reflectiveCurveToRelative(4.925f, 11f, 11f, 11f)
            reflectiveCurveToRelative(11f, -4.925f, 11f, -11f)
            curveToRelative(0f, -0.453f, -0.027f, -0.9f, -0.08f, -1.34f)
            curveToRelative(-0.05f, -0.411f, -0.425f, -0.704f, -0.836f, -0.654f)
            curveToRelative(-0.411f, 0.05f, -0.704f, 0.424f, -0.654f, 0.835f)
            curveToRelative(0.046f, 0.38f, 0.07f, 0.766f, 0.07f, 1.159f)
            curveToRelative(0f, 5.247f, -4.253f, 9.5f, -9.5f, 9.5f)
            reflectiveCurveTo(4.5f, 19.247f, 4.5f, 14f)
            close()
        }
    }.build()
}
