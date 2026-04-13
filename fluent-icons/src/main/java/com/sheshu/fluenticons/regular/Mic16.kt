package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Mic16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Mic16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 4.5f)
            curveTo(5.5f, 3.12f, 6.62f, 2f, 8f, 2f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(5.5f, 9.38f, 5.5f, 8f)
            verticalLineTo(4.5f)
            close()
            moveTo(8f, 3f)
            curveTo(7.172f, 3f, 6.5f, 3.672f, 6.5f, 4.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveTo(9.5f, 8.828f, 9.5f, 8f)
            verticalLineTo(4.5f)
            curveTo(9.5f, 3.672f, 8.828f, 3f, 8f, 3f)
            close()
            moveTo(4f, 7.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            curveToRelative(0f, 2.316f, -1.75f, 4.224f, -4f, 4.473f)
            verticalLineTo(13.5f)
            curveTo(8.5f, 13.776f, 8.276f, 14f, 8f, 14f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-1.027f)
            curveToRelative(-2.25f, -0.25f, -4f, -2.157f, -4f, -4.473f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
