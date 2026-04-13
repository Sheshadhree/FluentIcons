package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookmarkMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookmarkMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.268f, 3f)
            curveTo(6.613f, 2.402f, 7.26f, 2f, 8f, 2f)
            horizontalLineToRelative(4.5f)
            curveTo(14.433f, 2f, 16f, 3.567f, 16f, 5.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.184f, -0.101f, 0.354f, -0.264f, 0.44f)
            curveToRelative(-0.163f, 0.088f, -0.36f, 0.078f, -0.513f, -0.024f)
            lineTo(15f, 15.768f)
            verticalLineTo(5.5f)
            curveTo(15f, 4.12f, 13.88f, 3f, 12.5f, 3f)
            horizontalLineTo(6.268f)
            close()
            moveTo(6f, 4f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.184f, 0.101f, 0.354f, 0.264f, 0.44f)
            curveToRelative(0.163f, 0.088f, 0.36f, 0.078f, 0.513f, -0.024f)
            lineTo(9f, 15.101f)
            lineToRelative(4.223f, 2.815f)
            curveToRelative(0.153f, 0.102f, 0.35f, 0.112f, 0.513f, 0.025f)
            curveTo(13.898f, 17.854f, 14f, 17.684f, 14f, 17.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
