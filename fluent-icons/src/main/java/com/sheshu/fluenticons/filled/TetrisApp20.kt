package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TetrisApp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TetrisApp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 2.75f)
            curveTo(7f, 2.336f, 7.336f, 2f, 7.75f, 2f)
            horizontalLineTo(11f)
            verticalLineToRelative(4f)
            horizontalLineTo(7f)
            verticalLineTo(2.75f)
            close()
            moveTo(2.75f, 7f)
            curveTo(2.336f, 7f, 2f, 7.336f, 2f, 7.75f)
            verticalLineToRelative(2.5f)
            curveTo(2f, 10.664f, 2.336f, 11f, 2.75f, 11f)
            horizontalLineTo(6f)
            verticalLineTo(7f)
            horizontalLineTo(2.75f)
            close()
            moveTo(11f, 7f)
            horizontalLineTo(7f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(7f)
            close()
            moveToRelative(4.25f, -5f)
            horizontalLineTo(12f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3.25f)
            curveTo(15.664f, 6f, 16f, 5.664f, 16f, 5.25f)
            verticalLineToRelative(-2.5f)
            curveTo(16f, 2.336f, 15.664f, 2f, 15.25f, 2f)
            close()
            moveTo(4f, 14.75f)
            curveTo(4f, 14.336f, 4.336f, 14f, 4.75f, 14f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 18f, 4f, 17.664f, 4f, 17.25f)
            verticalLineToRelative(-2.5f)
            close()
            moveTo(13f, 18f)
            verticalLineToRelative(-4f)
            horizontalLineTo(9f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(5f, -4f)
            verticalLineToRelative(3.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(14f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(-3.25f, -5f)
            curveTo(14.336f, 9f, 14f, 9.336f, 14f, 9.75f)
            verticalLineTo(13f)
            horizontalLineToRelative(4f)
            verticalLineTo(9.75f)
            curveTo(18f, 9.336f, 17.664f, 9f, 17.25f, 9f)
            horizontalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
