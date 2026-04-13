package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookTheta20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookTheta20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.776f, 17f, 15.5f, 17f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
            moveToRelative(1f, 7f)
            curveToRelative(0f, -1.059f, 0.306f, -2.038f, 0.825f, -2.766f)
            curveTo(8.345f, 5.508f, 9.106f, 5f, 10f, 5f)
            curveToRelative(0.894f, 0f, 1.656f, 0.508f, 2.175f, 1.234f)
            curveTo(12.695f, 6.962f, 13f, 7.941f, 13f, 9f)
            reflectiveCurveToRelative(-0.306f, 2.038f, -0.825f, 2.765f)
            curveTo(11.655f, 12.492f, 10.894f, 13f, 10f, 13f)
            curveToRelative(-0.894f, 0f, -1.656f, -0.508f, -2.175f, -1.235f)
            curveTo(7.305f, 11.038f, 7f, 10.06f, 7f, 9f)
            close()
            moveToRelative(4.972f, 0.5f)
            curveToRelative(-0.076f, 0.667f, -0.301f, 1.25f, -0.611f, 1.684f)
            curveTo(10.975f, 11.724f, 10.487f, 12f, 10f, 12f)
            reflectiveCurveToRelative(-0.975f, -0.275f, -1.36f, -0.816f)
            curveTo(8.33f, 10.75f, 8.103f, 10.167f, 8.027f, 9.5f)
            horizontalLineToRelative(3.944f)
            close()
            moveToRelative(0f, -1f)
            curveToRelative(-0.076f, -0.667f, -0.301f, -1.25f, -0.611f, -1.684f)
            curveTo(10.975f, 6.276f, 10.487f, 6f, 10f, 6f)
            reflectiveCurveTo(9.025f, 6.276f, 8.64f, 6.816f)
            curveTo(8.33f, 7.25f, 8.103f, 7.833f, 8.027f, 8.5f)
            horizontalLineToRelative(3.944f)
            close()
        }
    }.build()
}
