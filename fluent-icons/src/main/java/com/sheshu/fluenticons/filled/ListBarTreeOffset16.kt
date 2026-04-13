package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ListBarTreeOffset16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ListBarTreeOffset16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 5f)
            horizontalLineToRelative(6.75f)
            curveTo(13.44f, 5f, 14f, 4.44f, 14f, 3.75f)
            verticalLineToRelative(-0.5f)
            curveTo(14f, 2.56f, 13.44f, 2f, 12.75f, 2f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            close()
            moveTo(5f, 2f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 2f, 2f, 2.56f, 2f, 3.25f)
            verticalLineToRelative(0.5f)
            curveTo(2f, 4.44f, 2.56f, 5f, 3.25f, 5f)
            horizontalLineTo(5f)
            verticalLineTo(2f)
            close()
            moveToRelative(3f, 8f)
            horizontalLineToRelative(4.75f)
            curveTo(13.44f, 10f, 14f, 9.44f, 14f, 8.75f)
            verticalLineToRelative(-1.5f)
            curveTo(14f, 6.56f, 13.44f, 6f, 12.75f, 6f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            close()
            moveTo(7f, 6f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 6f, 4f, 6.56f, 4f, 7.25f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 9.44f, 4.56f, 10f, 5.25f, 10f)
            horizontalLineTo(7f)
            verticalLineTo(6f)
            close()
            moveToRelative(5.75f, 8f)
            horizontalLineTo(10f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(2.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            close()
            moveToRelative(-5.5f, -3f)
            horizontalLineTo(9f)
            verticalLineToRelative(3f)
            horizontalLineTo(7.25f)
            curveTo(6.56f, 14f, 6f, 13.44f, 6f, 12.75f)
            verticalLineToRelative(-0.5f)
            curveTo(6f, 11.56f, 6.56f, 11f, 7.25f, 11f)
            close()
        }
    }.build()
}
