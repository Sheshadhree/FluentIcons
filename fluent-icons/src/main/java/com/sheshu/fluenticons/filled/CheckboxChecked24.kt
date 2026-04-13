package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CheckboxChecked24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CheckboxChecked24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveToRelative(11.03f, 6.28f)
            lineToRelative(-6.754f, 6.747f)
            curveToRelative(-0.293f, 0.292f, -0.767f, 0.292f, -1.06f, 0f)
            lineTo(6.72f, 13.28f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.768f, -0.293f, 1.06f, 0f)
            lineToRelative(2.217f, 2.216f)
            lineToRelative(6.223f, -6.217f)
            curveToRelative(0.293f, -0.292f, 0.768f, -0.292f, 1.06f, 0.001f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            close()
        }
    }.build()
}
