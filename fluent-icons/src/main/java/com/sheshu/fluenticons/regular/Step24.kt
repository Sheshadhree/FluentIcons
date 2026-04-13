package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Step24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Step24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 3.25f)
            curveTo(14.5f, 2.56f, 15.06f, 2f, 15.75f, 2f)
            horizontalLineToRelative(5f)
            curveTo(21.44f, 2f, 22f, 2.56f, 22f, 3.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 22f, 2f, 21.44f, 2f, 20.75f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineTo(8f)
            verticalLineTo(9.25f)
            curveTo(8f, 8.56f, 8.56f, 8f, 9.25f, 8f)
            horizontalLineToRelative(5.25f)
            verticalLineTo(3.25f)
            close()
            moveTo(16f, 3.5f)
            verticalLineToRelative(4.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(5.25f)
            curveTo(9.5f, 15.44f, 8.94f, 16f, 8.25f, 16f)
            horizontalLineTo(3.5f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(15.25f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(3.5f)
            horizontalLineTo(16f)
            close()
        }
    }.build()
}
