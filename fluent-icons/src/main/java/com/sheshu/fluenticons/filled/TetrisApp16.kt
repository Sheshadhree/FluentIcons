package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TetrisApp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TetrisApp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2.75f)
            curveTo(6f, 2.336f, 6.336f, 2f, 6.75f, 2f)
            horizontalLineTo(9f)
            verticalLineToRelative(3f)
            horizontalLineTo(6f)
            verticalLineTo(2.75f)
            close()
            moveTo(2.75f, 6f)
            curveTo(2.336f, 6f, 2f, 6.336f, 2f, 6.75f)
            verticalLineToRelative(1.5f)
            curveTo(2f, 8.664f, 2.336f, 9f, 2.75f, 9f)
            horizontalLineTo(5f)
            verticalLineTo(6f)
            horizontalLineTo(2.75f)
            close()
            moveTo(9f, 6f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2.25f)
            curveTo(8.664f, 9f, 9f, 8.664f, 9f, 8.25f)
            verticalLineTo(6f)
            close()
            moveToRelative(3.25f, -4f)
            horizontalLineTo(10f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2.25f)
            curveTo(12.664f, 5f, 13f, 4.664f, 13f, 4.25f)
            verticalLineToRelative(-1.5f)
            curveTo(13f, 2.336f, 12.664f, 2f, 12.25f, 2f)
            close()
            moveTo(3f, 11.75f)
            curveTo(3f, 11.336f, 3.336f, 11f, 3.75f, 11f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 14f, 3f, 13.664f, 3f, 13.25f)
            verticalLineToRelative(-1.5f)
            close()
            moveTo(10f, 11f)
            horizontalLineTo(7f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(1f, 0f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(11f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(0.75f, -4f)
            curveTo(11.336f, 7f, 11f, 7.336f, 11f, 7.75f)
            verticalLineTo(10f)
            horizontalLineToRelative(3f)
            verticalLineTo(7.75f)
            curveTo(14f, 7.336f, 13.664f, 7f, 13.25f, 7f)
            horizontalLineToRelative(-1.5f)
            close()
        }
    }.build()
}
