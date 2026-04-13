package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSortUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSortUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.75f, 3f)
            curveToRelative(0.235f, 0f, 0.452f, 0.108f, 0.59f, 0.278f)
            lineToRelative(2.94f, 2.945f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.061f)
            curveToRelative(-0.292f, 0.293f, -0.766f, 0.293f, -1.058f, 0f)
            lineTo(10.5f, 5.566f)
            verticalLineTo(16.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(9f, 16.664f, 9f, 16.25f)
            verticalLineTo(5.556f)
            lineTo(7.278f, 7.289f)
            curveToRelative(-0.292f, 0.293f, -0.766f, 0.293f, -1.059f, 0f)
            curveToRelative(-0.292f, -0.293f, -0.292f, -0.768f, 0f, -1.061f)
            lineTo(9.223f, 3.22f)
            curveTo(9.37f, 3.072f, 9.557f, 2.999f, 9.75f, 3f)
            close()
        }
    }.build()
}
