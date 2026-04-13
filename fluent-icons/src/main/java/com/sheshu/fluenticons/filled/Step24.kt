package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Step24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Step24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.75f, 2f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineTo(8f)
            horizontalLineTo(9.25f)
            curveTo(8.56f, 8f, 8f, 8.56f, 8f, 9.25f)
            verticalLineToRelative(5.25f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 14.5f, 2f, 15.06f, 2f, 15.75f)
            verticalLineToRelative(5f)
            curveTo(2f, 21.44f, 2.56f, 22f, 3.25f, 22f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(3.25f)
            curveTo(22f, 2.56f, 21.44f, 2f, 20.75f, 2f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
