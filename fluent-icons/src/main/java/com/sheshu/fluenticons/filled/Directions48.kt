package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Directions48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Directions48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.835f, 28.42f)
            curveToRelative(-2.441f, -2.442f, -2.441f, -6.399f, 0f, -8.84f)
            lineTo(19.582f, 5.833f)
            curveToRelative(2.44f, -2.44f, 6.398f, -2.44f, 8.839f, 0f)
            lineTo(42.17f, 19.58f)
            curveToRelative(2.44f, 2.441f, 2.44f, 6.399f, 0f, 8.84f)
            lineTo(28.422f, 42.167f)
            curveToRelative(-2.441f, 2.44f, -6.398f, 2.44f, -8.84f, 0f)
            lineTo(5.835f, 28.419f)
            close()
            moveToRelative(20.799f, -15.054f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineTo(27.732f, 18f)
            horizontalLineTo(24.25f)
            curveTo(20.798f, 18f, 18f, 20.798f, 18f, 24.25f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -2.071f, 1.679f, -3.75f, 3.75f, -3.75f)
            horizontalLineToRelative(3.482f)
            lineToRelative(-2.866f, 2.866f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(1.28f, 0.488f, 1.768f, 0f)
            lineToRelative(5f, -5f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-5f, -5f)
            close()
        }
    }.build()
}
