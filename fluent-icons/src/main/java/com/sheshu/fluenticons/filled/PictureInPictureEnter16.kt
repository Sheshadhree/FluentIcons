package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PictureInPictureEnter16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PictureInPictureEnter16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(2.12f, 2f, 1f, 3.12f, 1f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 10.88f, 2.12f, 12f, 3.5f, 12f)
            horizontalLineTo(7f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(5f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-8f)
            close()
            moveToRelative(0.147f, 2.646f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineTo(6f, 6.293f)
            verticalLineTo(5.5f)
            curveTo(6f, 5.224f, 6.224f, 5f, 6.5f, 5f)
            reflectiveCurveTo(7f, 5.224f, 7f, 5.5f)
            verticalLineToRelative(2f)
            curveTo(7f, 7.776f, 6.776f, 8f, 6.5f, 8f)
            horizontalLineToRelative(-2f)
            curveTo(4.224f, 8f, 4f, 7.776f, 4f, 7.5f)
            reflectiveCurveTo(4.224f, 7f, 4.5f, 7f)
            horizontalLineToRelative(0.793f)
            lineTo(3.646f, 5.354f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            close()
            moveTo(8f, 10f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(9f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
