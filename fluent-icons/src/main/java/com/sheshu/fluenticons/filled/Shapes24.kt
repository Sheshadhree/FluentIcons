package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Shapes24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Shapes24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8.75f)
            curveTo(2f, 5.022f, 5.022f, 2f, 8.75f, 2f)
            curveToRelative(3.474f, 0f, 6.336f, 2.625f, 6.709f, 6f)
            horizontalLineTo(12.25f)
            curveTo(9.903f, 8f, 8f, 9.903f, 8f, 12.25f)
            verticalLineToRelative(3.209f)
            curveToRelative(-3.375f, -0.373f, -6f, -3.235f, -6f, -6.709f)
            close()
            moveTo(12.25f, 9f)
            curveTo(10.455f, 9f, 9f, 10.455f, 9f, 12.25f)
            verticalLineToRelative(6.5f)
            curveTo(9f, 20.545f, 10.455f, 22f, 12.25f, 22f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-6.5f)
            curveTo(22f, 10.455f, 20.545f, 9f, 18.75f, 9f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
