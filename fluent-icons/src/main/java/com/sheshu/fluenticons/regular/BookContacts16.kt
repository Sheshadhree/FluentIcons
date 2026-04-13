package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookContacts16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookContacts16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 1f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(9.497f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(4f)
            verticalLineTo(13f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 15f, 12.5f, 15f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            close()
            moveTo(5f, 2f)
            curveTo(4.448f, 2f, 4f, 2.448f, 4f, 3f)
            verticalLineToRelative(8.997f)
            horizontalLineToRelative(8f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(5f)
            close()
            moveToRelative(4.3f, 5f)
            curveToRelative(0.663f, 0f, 1.2f, 0.537f, 1.2f, 1.2f)
            curveTo(10.5f, 9.03f, 9.719f, 10f, 8f, 10f)
            curveToRelative(-1.719f, 0f, -2.5f, -0.971f, -2.5f, -1.8f)
            curveTo(5.5f, 7.537f, 6.037f, 7f, 6.7f, 7f)
            horizontalLineToRelative(2.6f)
            close()
            moveTo(8f, 3.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(8.69f, 6f, 8f, 6f)
            reflectiveCurveTo(6.75f, 5.44f, 6.75f, 4.75f)
            reflectiveCurveTo(7.31f, 3.5f, 8f, 3.5f)
            close()
        }
    }.build()
}
