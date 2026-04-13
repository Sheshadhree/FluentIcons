package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Temperature32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Temperature32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 5.5f)
            curveToRelative(-1.795f, 0f, -3.25f, 1.455f, -3.25f, 3.25f)
            verticalLineToRelative(9.754f)
            lineToRelative(-0.313f, 0.354f)
            curveToRelative(-0.74f, 0.838f, -1.187f, 1.936f, -1.187f, 3.142f)
            curveToRelative(0f, 2.623f, 2.127f, 4.75f, 4.75f, 4.75f)
            reflectiveCurveToRelative(4.75f, -2.127f, 4.75f, -4.75f)
            curveToRelative(0f, -1.206f, -0.447f, -2.303f, -1.187f, -3.142f)
            lineToRelative(-0.313f, -0.354f)
            verticalLineTo(8.75f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            close()
            moveToRelative(-5.75f, 3.25f)
            curveTo(10.25f, 5.574f, 12.824f, 3f, 16f, 3f)
            reflectiveCurveToRelative(5.75f, 2.574f, 5.75f, 5.75f)
            verticalLineToRelative(8.834f)
            curveToRelative(0.94f, 1.222f, 1.5f, 2.755f, 1.5f, 4.416f)
            curveToRelative(0f, 4.004f, -3.246f, 7.25f, -7.25f, 7.25f)
            reflectiveCurveTo(8.75f, 26.004f, 8.75f, 22f)
            curveToRelative(0f, -1.661f, 0.56f, -3.194f, 1.5f, -4.416f)
            verticalLineTo(8.75f)
            close()
            moveToRelative(4.5f, 3.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(7.022f)
            curveTo(18.283f, 19.746f, 19f, 20.789f, 19f, 22f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            curveToRelative(0f, -1.21f, 0.717f, -2.254f, 1.75f, -2.728f)
            verticalLineTo(12.25f)
            close()
        }
    }.build()
}
