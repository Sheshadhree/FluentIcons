package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Battery528: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Battery528",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10.75f)
            curveTo(2f, 8.679f, 3.679f, 7f, 5.75f, 7f)
            horizontalLineToRelative(14.5f)
            curveTo(22.321f, 7f, 24f, 8.679f, 24f, 10.75f)
            verticalLineTo(12f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(5.75f)
            curveTo(3.679f, 21f, 2f, 19.321f, 2f, 17.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveTo(5f, 11f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
        }
    }.build()
}
