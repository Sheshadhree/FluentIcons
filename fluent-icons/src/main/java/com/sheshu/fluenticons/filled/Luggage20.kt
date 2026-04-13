package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Luggage20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Luggage20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 2f)
            curveTo(6.224f, 2f, 6f, 2.224f, 6f, 2.5f)
            reflectiveCurveTo(6.224f, 3f, 6.5f, 3f)
            horizontalLineTo(7f)
            verticalLineToRelative(1f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 4f, 4f, 5.12f, 4f, 6.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.21f, 0.859f, 2.218f, 2f, 2.45f)
            verticalLineToRelative(0.55f)
            curveTo(6f, 17.776f, 6.224f, 18f, 6.5f, 18f)
            reflectiveCurveTo(7f, 17.776f, 7f, 17.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-0.55f)
            curveToRelative(1.141f, -0.232f, 2f, -1.24f, 2f, -2.45f)
            verticalLineToRelative(-8f)
            curveTo(16f, 5.12f, 14.88f, 4f, 13.5f, 4f)
            horizontalLineTo(13f)
            verticalLineTo(3f)
            horizontalLineToRelative(0.5f)
            curveTo(13.776f, 3f, 14f, 2.776f, 14f, 2.5f)
            reflectiveCurveTo(13.776f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(12f, 3f)
            verticalLineToRelative(1f)
            horizontalLineTo(8f)
            verticalLineTo(3f)
            horizontalLineToRelative(4f)
            close()
            moveTo(6.5f, 8.5f)
            curveTo(6.5f, 8.224f, 6.724f, 8f, 7f, 8f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.276f, 9f, 13f, 9f)
            horizontalLineTo(7f)
            curveTo(6.724f, 9f, 6.5f, 8.776f, 6.5f, 8.5f)
            close()
        }
    }.build()
}
