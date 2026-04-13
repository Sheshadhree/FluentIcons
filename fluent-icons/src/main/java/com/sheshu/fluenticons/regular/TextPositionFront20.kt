package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextPositionFront20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextPositionFront20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            reflectiveCurveTo(3.224f, 4f, 3.5f, 4f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 4f, 17f, 3.776f, 17f, 3.5f)
            reflectiveCurveTo(16.776f, 3f, 16.5f, 3f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(3f, 8f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(2.5f)
            curveTo(7.5f, 13.776f, 7.276f, 14f, 7f, 14f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(11f)
            close()
            moveToRelative(7f, 0f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(11f)
            close()
            moveToRelative(3f, -2f)
            curveTo(16.776f, 9f, 17f, 9.224f, 17f, 9.5f)
            reflectiveCurveTo(16.776f, 10f, 16.5f, 10f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 10f, 3f, 9.776f, 3f, 9.5f)
            reflectiveCurveTo(3.224f, 9f, 3.5f, 9f)
            horizontalLineToRelative(13f)
            close()
            moveTo(10f, 5f)
            curveToRelative(1.763f, 0f, 3.222f, 1.304f, 3.465f, 3f)
            horizontalLineTo(12.45f)
            curveTo(12.218f, 6.859f, 11.21f, 6f, 10f, 6f)
            curveTo(8.79f, 6f, 7.782f, 6.859f, 7.55f, 8f)
            horizontalLineTo(6.535f)
            curveTo(6.778f, 6.304f, 8.237f, 5f, 10f, 5f)
            close()
            moveTo(3.5f, 15f)
            curveTo(3.224f, 15f, 3f, 15.224f, 3f, 15.5f)
            reflectiveCurveTo(3.224f, 16f, 3.5f, 16f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.776f, 15f, 16.5f, 15f)
            horizontalLineToRelative(-13f)
            close()
        }
    }.build()
}
