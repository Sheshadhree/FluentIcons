package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tabs20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tabs20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            horizontalLineToRelative(3f)
            curveToRelative(0.892f, 0f, 1.693f, 0.39f, 2.243f, 1.007f)
            curveTo(13.163f, 3.002f, 13.08f, 3f, 13f, 3f)
            horizontalLineTo(8f)
            curveTo(5.239f, 3f, 3f, 5.239f, 3f, 8f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.081f, 0.002f, 0.162f, 0.007f, 0.243f)
            curveTo(2.39f, 12.693f, 2f, 11.892f, 2f, 11f)
            verticalLineTo(8f)
            close()
            moveToRelative(2f, 0.5f)
            curveTo(4f, 6.015f, 6.015f, 4f, 8.5f, 4f)
            horizontalLineTo(13f)
            curveToRelative(0.892f, 0f, 1.693f, 0.39f, 2.243f, 1.007f)
            curveTo(15.163f, 5.002f, 15.08f, 5f, 15f, 5f)
            horizontalLineTo(8.5f)
            curveTo(6.567f, 5f, 5f, 6.567f, 5f, 8.5f)
            verticalLineTo(15f)
            curveToRelative(0f, 0.081f, 0.002f, 0.162f, 0.007f, 0.243f)
            curveTo(4.39f, 14.693f, 4f, 13.892f, 4f, 13f)
            verticalLineTo(8.5f)
            close()
            moveTo(9f, 6f)
            curveTo(7.343f, 6f, 6f, 7.343f, 6f, 9f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}
