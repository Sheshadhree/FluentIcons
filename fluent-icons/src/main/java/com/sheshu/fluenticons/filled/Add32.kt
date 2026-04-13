package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Add32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Add32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(10.75f)
            horizontalLineTo(28f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(17.25f)
            verticalLineTo(28f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(17.25f)
            horizontalLineTo(4f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveTo(3.31f, 14.75f, 4f, 14.75f)
            horizontalLineToRelative(10.75f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            close()
        }
    }.build()
}
