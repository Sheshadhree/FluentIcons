package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextDescription32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextDescription32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.25f, 6f)
            curveTo(2.56f, 6f, 2f, 6.56f, 2f, 7.25f)
            reflectiveCurveTo(2.56f, 8.5f, 3.25f, 8.5f)
            horizontalLineToRelative(25.5f)
            curveTo(29.44f, 8.5f, 30f, 7.94f, 30f, 7.25f)
            reflectiveCurveTo(29.44f, 6f, 28.75f, 6f)
            horizontalLineTo(3.25f)
            close()
            moveToRelative(0f, 6f)
            curveTo(2.56f, 12f, 2f, 12.56f, 2f, 13.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(25.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(29.44f, 12f, 28.75f, 12f)
            horizontalLineTo(3.25f)
            close()
            moveTo(2f, 19.25f)
            curveTo(2f, 18.56f, 2.56f, 18f, 3.25f, 18f)
            horizontalLineToRelative(25.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 20.5f, 2f, 19.94f, 2f, 19.25f)
            close()
            moveTo(3.25f, 24f)
            curveTo(2.56f, 24f, 2f, 24.56f, 2f, 25.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(20.44f, 24f, 19.75f, 24f)
            horizontalLineTo(3.25f)
            close()
        }
    }.build()
}
