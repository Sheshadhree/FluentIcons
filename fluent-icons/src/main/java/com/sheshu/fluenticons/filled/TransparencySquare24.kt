package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TransparencySquare24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TransparencySquare24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 2.5f)
            curveTo(4.179f, 2.5f, 2.5f, 4.179f, 2.5f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 6.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineTo(8f)
            verticalLineTo(8f)
            horizontalLineTo(4.5f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(0f, 5.75f)
            horizontalLineTo(8f)
            verticalLineTo(8f)
            horizontalLineToRelative(4f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(4f)
            horizontalLineTo(16f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(1.75f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(16f)
            verticalLineTo(16f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(3.5f)
            horizontalLineTo(8f)
            verticalLineTo(16f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(-4f)
            close()
            moveToRelative(7.5f, 0f)
            verticalLineToRelative(4f)
            horizontalLineTo(8f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(0f, 0f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(4f)
            close()
        }
    }.build()
}
