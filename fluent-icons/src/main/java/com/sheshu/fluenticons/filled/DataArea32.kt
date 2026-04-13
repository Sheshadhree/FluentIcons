package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataArea32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataArea32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 4.25f)
            curveTo(5.5f, 3.56f, 4.94f, 3f, 4.25f, 3f)
            reflectiveCurveTo(3f, 3.56f, 3f, 4.25f)
            verticalLineToRelative(20.5f)
            curveTo(3f, 27.097f, 4.903f, 29f, 7.25f, 29f)
            horizontalLineToRelative(20.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(7.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(7.25f, 25f)
            horizontalLineTo(26f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.379f, -0.214f, -0.725f, -0.553f, -0.894f)
            curveToRelative(-0.339f, -0.17f, -0.744f, -0.133f, -1.047f, 0.094f)
            lineToRelative(-7.506f, 5.63f)
            lineToRelative(-5.447f, -2.724f)
            curveToRelative(-0.263f, -0.132f, -0.57f, -0.141f, -0.84f, -0.025f)
            lineTo(7f, 12.626f)
            verticalLineTo(24.75f)
            curveTo(7f, 24.888f, 7.112f, 25f, 7.25f, 25f)
            close()
        }
    }.build()
}
