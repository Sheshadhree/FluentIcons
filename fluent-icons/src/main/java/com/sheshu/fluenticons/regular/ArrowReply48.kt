package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowReply48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowReply48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.134f, 10.134f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(-1.28f, -0.488f, -1.768f, 0f)
            lineToRelative(-11f, 11f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(11f, 11f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineTo(8.268f, 21.5f)
            horizontalLineTo(25.25f)
            curveToRelative(8.975f, 0f, 16.25f, 7.275f, 16.25f, 16.25f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveTo(44f, 38.44f, 44f, 37.75f)
            curveTo(44f, 27.395f, 35.605f, 19f, 25.25f, 19f)
            horizontalLineTo(8.268f)
            lineToRelative(8.866f, -8.866f)
            close()
        }
    }.build()
}
