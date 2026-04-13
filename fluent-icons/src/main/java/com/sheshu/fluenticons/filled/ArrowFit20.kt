package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowFit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowFit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.791f, 6.72f)
            curveTo(6.084f, 7.015f, 6.083f, 7.49f, 5.79f, 7.782f)
            lineTo(4.566f, 9f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 9f, 9f, 9.336f, 9f, 9.75f)
            reflectiveCurveTo(8.664f, 10.5f, 8.25f, 10.5f)
            horizontalLineTo(4.56f)
            lineToRelative(1.22f, 1.22f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-2.5f, -2.5f)
            curveTo(2.079f, 10.14f, 2f, 9.948f, 2f, 9.75f)
            curveToRelative(0f, -0.2f, 0.08f, -0.39f, 0.22f, -0.531f)
            lineToRelative(2.51f, -2.5f)
            curveTo(5.025f, 6.426f, 5.5f, 6.427f, 5.792f, 6.72f)
            close()
            moveToRelative(8.429f, 0f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-2.5f, 2.5f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(1.22f, -1.22f)
            horizontalLineToRelative(-3.69f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(11.336f, 9f, 11.75f, 9f)
            horizontalLineToRelative(3.69f)
            lineToRelative(-1.22f, -1.22f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            close()
        }
    }.build()
}
