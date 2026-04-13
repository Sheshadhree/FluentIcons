package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HomeEmpty24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomeEmpty24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.55f, 2.533f)
            curveToRelative(0.837f, -0.707f, 2.063f, -0.707f, 2.9f, 0f)
            lineToRelative(6.75f, 5.694f)
            curveToRelative(0.508f, 0.428f, 0.8f, 1.057f, 0.8f, 1.72f)
            verticalLineToRelative(8.803f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
            verticalLineTo(9.947f)
            curveToRelative(0f, -0.663f, 0.292f, -1.292f, 0.8f, -1.72f)
            lineToRelative(6.75f, -5.694f)
            close()
        }
    }.build()
}
