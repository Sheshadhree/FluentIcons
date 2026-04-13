package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowBounce16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowBounce16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.002f, 4.75f)
            curveTo(8.002f, 4.336f, 7.667f, 4f, 7.252f, 4f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(6.561f)
            lineToRelative(5.718f, 5.72f)
            curveTo(8.36f, 12.42f, 8.55f, 12.5f, 8.75f, 12.5f)
            reflectiveCurveToRelative(0.39f, -0.079f, 0.53f, -0.22f)
            lineToRelative(5.5f, -5.5f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.06f)
            curveToRelative(-0.292f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-4.97f, 4.97f)
            lineTo(3.562f, 5.5f)
            horizontalLineToRelative(3.69f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            close()
        }
    }.build()
}
