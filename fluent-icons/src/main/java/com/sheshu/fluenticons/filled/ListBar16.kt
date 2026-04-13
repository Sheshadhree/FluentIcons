package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ListBar16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ListBar16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 14f)
            horizontalLineToRelative(6.75f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(0f, -4f)
            horizontalLineToRelative(6.75f)
            curveTo(13.44f, 10f, 14f, 9.44f, 14f, 8.75f)
            verticalLineToRelative(-1.5f)
            curveTo(14f, 6.56f, 13.44f, 6f, 12.75f, 6f)
            horizontalLineTo(6f)
            verticalLineToRelative(4f)
            close()
            moveTo(5f, 6f)
            verticalLineToRelative(4f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 10f, 2f, 9.44f, 2f, 8.75f)
            verticalLineToRelative(-1.5f)
            curveTo(2f, 6.56f, 2.56f, 6f, 3.25f, 6f)
            horizontalLineTo(5f)
            close()
            moveToRelative(1f, -1f)
            horizontalLineToRelative(6.75f)
            curveTo(13.44f, 5f, 14f, 4.44f, 14f, 3.75f)
            verticalLineToRelative(-0.5f)
            curveTo(14f, 2.56f, 13.44f, 2f, 12.75f, 2f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            close()
            moveTo(5f, 2f)
            verticalLineToRelative(3f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 5f, 2f, 4.44f, 2f, 3.75f)
            verticalLineToRelative(-0.5f)
            curveTo(2f, 2.56f, 2.56f, 2f, 3.25f, 2f)
            horizontalLineTo(5f)
            close()
            moveToRelative(0f, 9f)
            verticalLineToRelative(3f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 14f, 2f, 13.44f, 2f, 12.75f)
            verticalLineToRelative(-0.5f)
            curveTo(2f, 11.56f, 2.56f, 11f, 3.25f, 11f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
