package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentFit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentFit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 1f)
            curveTo(3.895f, 1f, 3f, 1.895f, 3f, 3f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5f)
            close()
            moveToRelative(0f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(7.276f, 4f, 7f, 4f)
            horizontalLineTo(6f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(5f, 5.276f, 5f, 5f)
            verticalLineTo(4f)
            close()
            moveToRelative(0f, 8f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveTo(6f, 10.724f, 6f, 11f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(7.276f, 13f, 7f, 13f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(5f, -9f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 5.276f, 10f, 5f)
            verticalLineTo(4f)
            horizontalLineTo(9f)
            curveTo(8.724f, 4f, 8.5f, 3.776f, 8.5f, 3.5f)
            reflectiveCurveTo(8.724f, 3f, 9f, 3f)
            horizontalLineToRelative(1f)
            close()
            moveToRelative(1f, 9f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(9f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveTo(8.724f, 12f, 9f, 12f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveTo(11f, 10.724f, 11f, 11f)
            verticalLineToRelative(1f)
            close()
        }
    }.build()
}
