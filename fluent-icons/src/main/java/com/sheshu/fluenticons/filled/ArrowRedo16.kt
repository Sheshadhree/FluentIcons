package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRedo16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRedo16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.002f, 2.75f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            curveToRelative(-0.415f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(3.095f)
            lineTo(8.828f, 3.172f)
            curveToRelative(-1.562f, -1.563f, -4.094f, -1.563f, -5.656f, 0f)
            curveToRelative(-1.563f, 1.562f, -1.563f, 4.094f, 0f, 5.656f)
            lineToRelative(4.95f, 4.95f)
            curveToRelative(0.292f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-4.95f, -4.95f)
            curveToRelative(-0.976f, -0.976f, -0.976f, -2.56f, 0f, -3.536f)
            reflectiveCurveToRelative(2.56f, -0.976f, 3.536f, 0f)
            lineTo(10.036f, 6.5f)
            horizontalLineTo(7.752f)
            curveToRelative(-0.415f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(7.337f, 8f, 7.752f, 8f)
            horizontalLineToRelative(4.4f)
            curveToRelative(0.469f, 0f, 0.85f, -0.38f, 0.85f, -0.85f)
            verticalLineToRelative(-4.4f)
            close()
        }
    }.build()
}
