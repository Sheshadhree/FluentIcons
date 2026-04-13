package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(5.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(3f, 6.5f)
            horizontalLineTo(2f)
            verticalLineToRelative(3f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(3f)
            verticalLineTo(8.5f)
            close()
            moveToRelative(1f, 0f)
            horizontalLineTo(14f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-3f)
            verticalLineTo(8.5f)
            close()
            moveToRelative(5.5f, -1f)
            verticalLineToRelative(-3f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(5.5f)
            horizontalLineTo(14f)
            close()
        }
    }.build()
}
