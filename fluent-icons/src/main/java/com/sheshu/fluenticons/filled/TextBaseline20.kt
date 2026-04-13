package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextBaseline20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextBaseline20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.698f, 3.475f)
            curveTo(10.585f, 3.188f, 10.308f, 3f, 10.001f, 3f)
            curveTo(9.693f, 3f, 9.416f, 3.188f, 9.303f, 3.475f)
            lineToRelative(-3.75f, 9.5f)
            curveTo(5.4f, 13.36f, 5.59f, 13.795f, 5.975f, 13.948f)
            curveToRelative(0.385f, 0.152f, 0.82f, -0.037f, 0.973f, -0.423f)
            lineTo(8.142f, 10.5f)
            horizontalLineToRelative(3.716f)
            lineToRelative(1.195f, 3.025f)
            curveToRelative(0.152f, 0.386f, 0.587f, 0.575f, 0.973f, 0.423f)
            curveToRelative(0.385f, -0.152f, 0.574f, -0.588f, 0.422f, -0.973f)
            lineToRelative(-3.75f, -9.5f)
            close()
            moveTo(11.266f, 9f)
            horizontalLineTo(8.734f)
            lineToRelative(1.267f, -3.207f)
            lineTo(11.266f, 9f)
            close()
            moveTo(2.5f, 16f)
            curveTo(2.224f, 16f, 2f, 16.224f, 2f, 16.5f)
            reflectiveCurveTo(2.224f, 17f, 2.5f, 17f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 16f, 17.5f, 16f)
            horizontalLineToRelative(-15f)
            close()
        }
    }.build()
}
