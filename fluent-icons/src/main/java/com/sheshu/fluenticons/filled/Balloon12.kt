package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Balloon12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Balloon12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 1f)
            curveTo(7.41f, 1f, 9f, 2.484f, 9f, 4.364f)
            curveToRelative(0f, 1.235f, -0.46f, 2.375f, -1.104f, 3.208f)
            curveTo(7.386f, 8.232f, 6.71f, 8.762f, 6f, 8.937f)
            verticalLineTo(9.4f)
            curveToRelative(0f, 0.22f, 0.18f, 0.4f, 0.4f, 0.4f)
            horizontalLineToRelative(1.2f)
            curveToRelative(0.773f, 0f, 1.4f, 0.627f, 1.4f, 1.4f)
            verticalLineToRelative(0.3f)
            curveTo(9f, 11.776f, 8.776f, 12f, 8.5f, 12f)
            reflectiveCurveTo(8f, 11.776f, 8f, 11.5f)
            verticalLineToRelative(-0.3f)
            curveToRelative(0f, -0.22f, -0.18f, -0.4f, -0.4f, -0.4f)
            horizontalLineTo(6.4f)
            curveTo(5.627f, 10.8f, 5f, 10.173f, 5f, 9.4f)
            verticalLineTo(8.937f)
            curveTo(4.29f, 8.762f, 3.614f, 8.234f, 3.104f, 7.574f)
            curveTo(2.461f, 6.74f, 2f, 5.6f, 2f, 4.364f)
            curveTo(2f, 2.484f, 3.59f, 1f, 5.5f, 1f)
            close()
            moveToRelative(0.07f, 2.005f)
            curveTo(5.297f, 2.966f, 5.044f, 3.156f, 5.005f, 3.43f)
            curveTo(4.966f, 3.703f, 5.156f, 3.956f, 5.43f, 3.995f)
            curveToRelative(0.297f, 0.042f, 0.534f, 0.279f, 0.576f, 0.576f)
            curveToRelative(0.04f, 0.273f, 0.293f, 0.463f, 0.566f, 0.424f)
            curveToRelative(0.274f, -0.04f, 0.463f, -0.293f, 0.424f, -0.566f)
            curveTo(6.89f, 3.692f, 6.308f, 3.109f, 5.57f, 3.005f)
            close()
        }
    }.build()
}
