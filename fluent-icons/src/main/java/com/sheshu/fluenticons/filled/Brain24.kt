package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Brain24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Brain24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 2f)
            curveToRelative(0.645f, 0f, 1.245f, 0.188f, 1.75f, 0.512f)
            verticalLineToRelative(18.733f)
            curveTo(10.621f, 21.718f, 9.84f, 22f, 8.994f, 22f)
            curveToRelative(-1.726f, 0f, -3.196f, -1.187f, -3.627f, -2.8f)
            curveTo(3.46f, 18.895f, 2f, 17.243f, 2f, 15.25f)
            verticalLineTo(15f)
            curveToRelative(0f, -1.562f, 0.896f, -2.914f, 2.201f, -3.572f)
            curveTo(3.461f, 10.722f, 3f, 9.728f, 3f, 8.625f)
            curveToRelative(0f, -1.939f, 1.423f, -3.545f, 3.282f, -3.83f)
            curveTo(6.504f, 3.215f, 7.86f, 2f, 9.5f, 2f)
            close()
            moveToRelative(5f, 0f)
            curveToRelative(1.64f, 0f, 2.996f, 1.216f, 3.218f, 2.795f)
            curveTo(19.576f, 5.08f, 21f, 6.686f, 21f, 8.625f)
            curveToRelative(0f, 1.103f, -0.462f, 2.097f, -1.201f, 2.803f)
            curveTo(21.104f, 12.086f, 22f, 13.438f, 22f, 15f)
            verticalLineToRelative(0.25f)
            curveToRelative(0f, 1.994f, -1.459f, 3.646f, -3.367f, 3.95f)
            curveToRelative(-0.431f, 1.613f, -1.901f, 2.8f, -3.627f, 2.8f)
            curveToRelative(-0.846f, 0f, -1.627f, -0.282f, -2.256f, -0.755f)
            verticalLineTo(2.512f)
            curveTo(13.255f, 2.188f, 13.855f, 2f, 14.5f, 2f)
            close()
        }
    }.build()
}
