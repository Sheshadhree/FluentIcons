package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Text32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Text32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 5.25f)
            curveTo(6f, 4.56f, 6.56f, 4f, 7.25f, 4f)
            horizontalLineToRelative(17.5f)
            curveTo(25.44f, 4f, 26f, 4.56f, 26f, 5.25f)
            verticalLineToRelative(3.5f)
            curveTo(26f, 9.44f, 25.44f, 10f, 24.75f, 10f)
            reflectiveCurveTo(23.5f, 9.44f, 23.5f, 8.75f)
            verticalLineTo(6.5f)
            horizontalLineToRelative(-6.25f)
            verticalLineToRelative(19f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(19.44f, 28f, 18.75f, 28f)
            horizontalLineToRelative(-5.5f)
            curveTo(12.56f, 28f, 12f, 27.44f, 12f, 26.75f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-19f)
            horizontalLineTo(8.5f)
            verticalLineToRelative(2.25f)
            curveTo(8.5f, 9.44f, 7.94f, 10f, 7.25f, 10f)
            reflectiveCurveTo(6f, 9.44f, 6f, 8.75f)
            verticalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
