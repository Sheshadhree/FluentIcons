package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PlayCircle28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PlayCircle28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.766f, 9.278f)
            curveToRelative(-1f, -0.594f, -2.266f, 0.127f, -2.266f, 1.29f)
            verticalLineToRelative(6.864f)
            curveToRelative(0f, 1.163f, 1.266f, 1.884f, 2.266f, 1.29f)
            lineToRelative(6.505f, -3.862f)
            curveToRelative(0.652f, -0.388f, 0.652f, -1.332f, 0f, -1.72f)
            lineToRelative(-6.505f, -3.862f)
            close()
            moveTo(2f, 14f)
            curveTo(2f, 7.373f, 7.373f, 2f, 14f, 2f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(2f, 20.627f, 2f, 14f)
            close()
            moveTo(14f, 3.5f)
            curveTo(8.201f, 3.5f, 3.5f, 8.201f, 3.5f, 14f)
            reflectiveCurveTo(8.201f, 24.5f, 14f, 24.5f)
            reflectiveCurveTo(24.5f, 19.799f, 24.5f, 14f)
            reflectiveCurveTo(19.799f, 3.5f, 14f, 3.5f)
            close()
        }
    }.build()
}
