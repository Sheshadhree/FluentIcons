package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tab24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tab24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.75f)
            curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
            horizontalLineToRelative(12.5f)
            curveTo(19.769f, 3f, 21f, 4.231f, 21f, 5.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(5.75f)
            curveTo(4.231f, 21f, 3f, 19.769f, 3f, 18.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(5.75f, 5f)
            curveTo(5.336f, 5f, 5f, 5.336f, 5f, 5.75f)
            verticalLineToRelative(12.5f)
            curveTo(5f, 18.664f, 5.336f, 19f, 5.75f, 19f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(5.75f)
            curveTo(19f, 5.336f, 18.664f, 5f, 18.25f, 5f)
            horizontalLineTo(5.75f)
            close()
        }
    }.build()
}
