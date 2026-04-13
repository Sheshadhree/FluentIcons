package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tablet48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tablet48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 12.25f)
            curveTo(4f, 9.903f, 5.903f, 8f, 8.25f, 8f)
            horizontalLineToRelative(31.5f)
            curveTo(42.097f, 8f, 44f, 9.903f, 44f, 12.25f)
            verticalLineToRelative(23.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineTo(8.25f)
            curveTo(5.903f, 40f, 4f, 38.097f, 4f, 35.75f)
            verticalLineToRelative(-23.5f)
            close()
            moveTo(20f, 31f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(19.31f, 33.5f, 20f, 33.5f)
            horizontalLineToRelative(8f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(28.69f, 31f, 28f, 31f)
            horizontalLineToRelative(-8f)
            close()
        }
    }.build()
}
