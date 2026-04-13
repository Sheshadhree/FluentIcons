package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowForward48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowForward48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(30.866f, 10.134f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(1.28f, -0.488f, 1.768f, 0f)
            lineToRelative(11f, 11f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(-11f, 11f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(8.866f, -8.866f)
            horizontalLineTo(22.75f)
            curveToRelative(-8.975f, 0f, -16.25f, 7.275f, -16.25f, 16.25f)
            curveTo(6.5f, 38.44f, 5.94f, 39f, 5.25f, 39f)
            reflectiveCurveTo(4f, 38.44f, 4f, 37.75f)
            curveTo(4f, 27.395f, 12.395f, 19f, 22.75f, 19f)
            horizontalLineToRelative(16.982f)
            lineToRelative(-8.866f, -8.866f)
            close()
        }
    }.build()
}
