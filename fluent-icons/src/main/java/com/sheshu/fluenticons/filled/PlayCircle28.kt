package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PlayCircle28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PlayCircle28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveTo(7.373f, 2f, 2f, 7.373f, 2f, 14f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(20.627f, 2f, 14f, 2f)
            close()
            moveToRelative(-1.234f, 7.278f)
            lineToRelative(6.505f, 3.862f)
            curveToRelative(0.652f, 0.388f, 0.652f, 1.332f, 0f, 1.72f)
            lineToRelative(-6.505f, 3.862f)
            curveToRelative(-1f, 0.594f, -2.266f, -0.127f, -2.266f, -1.29f)
            verticalLineToRelative(-6.864f)
            curveToRelative(0f, -1.163f, 1.266f, -1.884f, 2.266f, -1.29f)
            close()
        }
    }.build()
}
