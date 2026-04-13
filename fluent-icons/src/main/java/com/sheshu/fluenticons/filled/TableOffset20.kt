package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableOffset20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableOffset20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            horizontalLineTo(12f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            close()
            moveTo(8f, 8f)
            horizontalLineToRelative(9f)
            verticalLineToRelative(4f)
            horizontalLineTo(8f)
            verticalLineTo(8f)
            close()
            moveToRelative(-1f, 4f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(-4f, 1f)
            horizontalLineToRelative(9f)
            verticalLineToRelative(4f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineTo(13f)
            close()
            moveToRelative(10f, 0f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(0f, -6f)
            horizontalLineToRelative(4f)
            verticalLineTo(5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineTo(13f)
            verticalLineToRelative(4f)
            close()
        }
    }.build()
}
