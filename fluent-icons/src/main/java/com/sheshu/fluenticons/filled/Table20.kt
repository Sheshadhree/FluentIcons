package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Table20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Table20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 17f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(0f, -5f)
            verticalLineTo(8f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(-1f, 0f)
            horizontalLineTo(8f)
            verticalLineTo(8f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(-4f, 1f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(8f)
            verticalLineToRelative(-4f)
            close()
            moveToRelative(-1f, -1f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(-4f, 1f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineTo(13f)
            close()
            moveToRelative(10f, -6f)
            horizontalLineToRelative(4f)
            verticalLineTo(5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineTo(13f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(-1f, -4f)
            verticalLineToRelative(4f)
            horizontalLineTo(8f)
            verticalLineTo(3f)
            horizontalLineToRelative(4f)
            close()
            moveTo(7f, 3f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
