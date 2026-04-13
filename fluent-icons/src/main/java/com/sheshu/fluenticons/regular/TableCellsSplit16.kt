package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableCellsSplit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableCellsSplit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(3.085f, 4f)
            horizontalLineTo(7f)
            verticalLineTo(3f)
            horizontalLineTo(4.5f)
            curveTo(3.847f, 3f, 3.291f, 3.417f, 3.085f, 4f)
            close()
            moveTo(8f, 3f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(4.915f)
            curveToRelative(-0.206f, -0.583f, -0.762f, -1f, -1.415f, -1f)
            horizontalLineTo(8f)
            close()
            moveToRelative(5f, 2f)
            horizontalLineTo(3f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(10f)
            verticalLineTo(5f)
            close()
            moveToRelative(-0.085f, 7f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.653f, 0f, 1.209f, -0.417f, 1.415f, -1f)
            close()
            moveTo(7f, 13f)
            verticalLineToRelative(-1f)
            horizontalLineTo(3.085f)
            curveToRelative(0.206f, 0.583f, 0.762f, 1f, 1.415f, 1f)
            horizontalLineTo(7f)
            close()
            moveToRelative(0f, -3f)
            verticalLineTo(6f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(4f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
