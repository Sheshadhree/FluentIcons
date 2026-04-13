package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Question20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Question20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveTo(7.794f, 3f, 6f, 4.794f, 6f, 7f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(7f, 7.276f, 7f, 7f)
            curveToRelative(0f, -1.654f, 1.346f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.346f, 3f, 3f)
            curveToRelative(0f, 1.249f, -0.692f, 1.863f, -1.575f, 2.62f)
            lineToRelative(-0.032f, 0.027f)
            curveTo(10.534f, 10.384f, 9.5f, 11.27f, 9.5f, 13f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(13f)
            curveToRelative(0f, -1.249f, 0.692f, -1.863f, 1.575f, -2.62f)
            lineToRelative(0.032f, -0.027f)
            curveTo(12.966f, 9.615f, 14f, 8.73f, 14f, 7f)
            curveToRelative(0f, -2.206f, -1.794f, -4f, -4f, -4f)
            close()
            moveToRelative(0f, 14f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.414f, 15.5f, 10f, 15.5f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(9.586f, 17f, 10f, 17f)
            close()
        }
    }.build()
}
