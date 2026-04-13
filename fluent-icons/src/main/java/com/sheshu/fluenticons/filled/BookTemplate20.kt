package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookTemplate20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookTemplate20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 1f)
            curveTo(3.12f, 1f, 2f, 2.12f, 2f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineTo(8f)
            verticalLineTo(9f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 9f, 5f, 8.776f, 5f, 8.5f)
            reflectiveCurveTo(5.224f, 8f, 5.5f, 8f)
            horizontalLineToRelative(2.67f)
            curveToRelative(0.132f, -0.373f, 0.336f, -0.712f, 0.594f, -1f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 7f, 5f, 6.776f, 5f, 6.5f)
            reflectiveCurveTo(5.224f, 6f, 5.5f, 6f)
            horizontalLineTo(16f)
            verticalLineTo(3.5f)
            curveTo(16f, 2.12f, 14.88f, 1f, 13.5f, 1f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(5f, 4.5f)
            curveTo(5f, 4.224f, 5.224f, 4f, 5.5f, 4f)
            horizontalLineToRelative(7f)
            curveTo(12.776f, 4f, 13f, 4.224f, 13f, 4.5f)
            reflectiveCurveTo(12.776f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-7f)
            curveTo(5.224f, 5f, 5f, 4.776f, 5f, 4.5f)
            close()
            moveTo(18f, 9f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-5f)
            curveTo(9.895f, 7f, 9f, 7.895f, 9f, 9f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 18f, 17.5f, 18f)
            horizontalLineTo(11f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-0.003f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(9f)
            close()
            moveToRelative(-8f, 6.997f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(6.997f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
