package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Laptop48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Laptop48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 12.25f)
            curveTo(8f, 9.903f, 9.903f, 8f, 12.25f, 8f)
            horizontalLineToRelative(23.5f)
            curveTo(38.097f, 8f, 40f, 9.903f, 40f, 12.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(9.903f, 32f, 8f, 30.097f, 8f, 27.75f)
            verticalLineToRelative(-15.5f)
            close()
            moveTo(5.25f, 35.5f)
            curveTo(4.56f, 35.5f, 4f, 36.06f, 4f, 36.75f)
            reflectiveCurveTo(4.56f, 38f, 5.25f, 38f)
            horizontalLineToRelative(37.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}
