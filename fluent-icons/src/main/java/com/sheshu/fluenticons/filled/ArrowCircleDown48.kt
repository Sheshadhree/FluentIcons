package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleDown48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleDown48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            curveTo(12.954f, 4f, 4f, 12.954f, 4f, 24f)
            reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
            reflectiveCurveToRelative(20f, -8.954f, 20f, -20f)
            reflectiveCurveTo(35.046f, 4f, 24f, 4f)
            close()
            moveToRelative(-8.634f, 19.866f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            lineToRelative(5.616f, 5.616f)
            verticalLineTo(15.25f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(14.232f)
            lineToRelative(5.616f, -5.616f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(-7.75f, 7.75f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            lineToRelative(-7.75f, -7.75f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            close()
        }
    }.build()
}
