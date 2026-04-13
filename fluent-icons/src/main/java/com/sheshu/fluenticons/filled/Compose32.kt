package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Compose32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Compose32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.75f, 4f)
            curveTo(18.44f, 4f, 19f, 4.56f, 19f, 5.25f)
            reflectiveCurveTo(18.44f, 6.5f, 17.75f, 6.5f)
            horizontalLineToRelative(-10f)
            curveTo(6.507f, 6.5f, 5.5f, 7.507f, 5.5f, 8.75f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveTo(28f, 13.56f, 28f, 14.25f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            horizontalLineTo(7.75f)
            curveTo(5.127f, 29f, 3f, 26.873f, 3f, 24.25f)
            verticalLineTo(8.75f)
            curveTo(3f, 6.127f, 5.127f, 4f, 7.75f, 4f)
            horizontalLineToRelative(10f)
            close()
            moveToRelative(9.116f, -0.634f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, 1.28f, 0f, 1.768f)
            lineTo(14.65f, 19.116f)
            lineTo(12f, 20f)
            lineToRelative(0.884f, -2.651f)
            lineTo(26.866f, 3.366f)
            close()
        }
    }.build()
}
