package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSplit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSplit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(8f)
            horizontalLineToRelative(2.245f)
            curveToRelative(1.104f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4.443f)
            lineToRelative(1.225f, -1.223f)
            curveToRelative(0.293f, -0.292f, 0.768f, -0.292f, 1.06f, 0.002f)
            curveToRelative(0.293f, 0.293f, 0.292f, 0.768f, -0.001f, 1.06f)
            lineToRelative(-2.505f, 2.5f)
            curveToRelative(-0.292f, 0.292f, -0.767f, 0.291f, -1.06f, -0.001f)
            lineToRelative(-2.499f, -2.5f)
            curveToRelative(-0.293f, -0.292f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.768f, -0.293f, 1.06f, 0f)
            lineToRelative(1.22f, 1.219f)
            verticalLineTo(10f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(6.999f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(4.44f)
            lineToRelative(1.22f, -1.219f)
            curveToRelative(0.292f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            lineToRelative(-2.5f, 2.5f)
            curveTo(6.14f, 16.92f, 5.95f, 17f, 5.75f, 17f)
            curveToRelative(-0.199f, 0f, -0.39f, -0.08f, -0.53f, -0.22f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.292f, -0.292f, -0.292f, -0.767f, 0f, -1.06f)
            curveToRelative(0.294f, -0.293f, 0.768f, -0.293f, 1.061f, 0f)
            lineTo(5f, 14.44f)
            verticalLineTo(10f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2.25f)
            verticalLineTo(3.75f)
            curveTo(9.25f, 3.336f, 9.584f, 3f, 10f, 3f)
            close()
        }
    }.build()
}
