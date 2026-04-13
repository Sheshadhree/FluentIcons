package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookUpRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookUpRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.462f, 10.913f)
            curveTo(5.117f, 11.588f, 6.068f, 12f, 7.25f, 12f)
            horizontalLineToRelative(3f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.818f, 0f, -1.367f, -0.276f, -1.712f, -0.632f)
            curveTo(5.185f, 9.504f, 5f, 9.01f, 5f, 8.5f)
            curveToRelative(0f, -0.51f, 0.185f, -1.004f, 0.538f, -1.369f)
            curveTo(5.883f, 6.777f, 6.432f, 6.5f, 7.25f, 6.5f)
            horizontalLineToRelative(3.19f)
            lineTo(9.72f, 7.22f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineTo(10.44f, 5f)
            horizontalLineTo(7.25f)
            curveTo(6.068f, 5f, 5.117f, 5.412f, 4.462f, 6.087f)
            curveTo(3.815f, 6.754f, 3.5f, 7.634f, 3.5f, 8.5f)
            curveToRelative(0f, 0.866f, 0.315f, 1.746f, 0.962f, 2.413f)
            close()
        }
    }.build()
}
