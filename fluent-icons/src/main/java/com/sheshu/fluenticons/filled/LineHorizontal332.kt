package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal332: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal332",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.25f)
            curveTo(2f, 5.56f, 2.56f, 5f, 3.25f, 5f)
            horizontalLineToRelative(25.5f)
            curveTo(29.44f, 5f, 30f, 5.56f, 30f, 6.25f)
            reflectiveCurveTo(29.44f, 7.5f, 28.75f, 7.5f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 7.5f, 2f, 6.94f, 2f, 6.25f)
            close()
            moveToRelative(0f, 10f)
            curveTo(2f, 15.56f, 2.56f, 15f, 3.25f, 15f)
            horizontalLineToRelative(25.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 17.5f, 2f, 16.94f, 2f, 16.25f)
            close()
            moveTo(3.25f, 25f)
            curveTo(2.56f, 25f, 2f, 25.56f, 2f, 26.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(25.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(29.44f, 25f, 28.75f, 25f)
            horizontalLineTo(3.25f)
            close()
        }
    }.build()
}
