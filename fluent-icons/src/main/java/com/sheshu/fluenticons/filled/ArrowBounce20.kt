package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowBounce20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowBounce20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 6f)
            curveTo(2.336f, 6f, 2f, 6.336f, 2f, 6.75f)
            verticalLineToRelative(6.5f)
            curveTo(2f, 13.664f, 2.336f, 14f, 2.75f, 14f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(8.56f)
            lineToRelative(6.47f, 6.47f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(6.754f, -6.754f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(10.5f, 13.439f)
            lineTo(4.56f, 7.5f)
            horizontalLineToRelative(4.69f)
            curveTo(9.664f, 7.5f, 10f, 7.164f, 10f, 6.75f)
            reflectiveCurveTo(9.664f, 6f, 9.25f, 6f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
