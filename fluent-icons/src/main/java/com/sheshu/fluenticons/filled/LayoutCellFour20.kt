package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutCellFour20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutCellFour20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 17f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineTo(17f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            close()
            moveToRelative(3f, -7.5f)
            horizontalLineToRelative(-6.5f)
            verticalLineTo(3f)
            horizontalLineTo(14f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(3.5f)
            close()
            moveToRelative(-7.5f, 0f)
            verticalLineTo(3f)
            horizontalLineTo(6f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(6.5f)
            close()
            moveToRelative(-6.5f, 1f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
