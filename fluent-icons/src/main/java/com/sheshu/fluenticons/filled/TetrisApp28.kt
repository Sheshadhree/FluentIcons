package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TetrisApp28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TetrisApp28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 3.25f)
            curveTo(9f, 2.56f, 9.56f, 2f, 10.25f, 2f)
            horizontalLineTo(15f)
            verticalLineToRelative(6f)
            horizontalLineTo(9f)
            verticalLineTo(3.25f)
            close()
            moveTo(3.25f, 9f)
            curveTo(2.56f, 9f, 2f, 9.56f, 2f, 10.25f)
            verticalLineToRelative(3.5f)
            curveTo(2f, 14.44f, 2.56f, 15f, 3.25f, 15f)
            horizontalLineTo(8f)
            verticalLineTo(9f)
            horizontalLineTo(3.25f)
            close()
            moveTo(15f, 9f)
            horizontalLineTo(9f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(4.75f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(9f)
            close()
            moveToRelative(5.75f, -7f)
            horizontalLineTo(16f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(4.75f)
            curveTo(21.44f, 8f, 22f, 7.44f, 22f, 6.75f)
            verticalLineToRelative(-3.5f)
            curveTo(22f, 2.56f, 21.44f, 2f, 20.75f, 2f)
            close()
            moveTo(5f, 20.256f)
            curveTo(5f, 19.562f, 5.562f, 19f, 6.256f, 19f)
            horizontalLineTo(11f)
            verticalLineToRelative(6f)
            horizontalLineTo(6.256f)
            curveTo(5.562f, 25f, 5f, 24.438f, 5f, 23.744f)
            verticalLineToRelative(-3.488f)
            close()
            moveTo(18f, 25f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(7f, -6f)
            verticalLineToRelative(4.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(19f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(-4.5f, -7f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
